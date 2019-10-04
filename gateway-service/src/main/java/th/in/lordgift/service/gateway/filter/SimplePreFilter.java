package th.in.lordgift.service.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

public class SimplePreFilter extends ZuulFilter {

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1; // run before PreDecoration
    }

    @Override
    public String filterType() {
        return PRE_TYPE;
    }


    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("RUNNNN");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(request.getRemoteAddr());
        if(!request.getRemoteAddr().equals("0:0:0:0:0:0:0:1")){
            //prevent routing
            ctx.setResponseStatusCode(400);
            ctx.setResponseBody("access denied");
            ctx.setSendZuulResponse(false);
        }

        //passthrough
        return null;
    }
}
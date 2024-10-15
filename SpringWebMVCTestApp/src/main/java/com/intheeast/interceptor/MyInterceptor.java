package com.intheeast.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {

    // 컨트롤러로 요청이 들어가기 전에 실행
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle: 컨트롤러에 요청이 도달하기 전에 실행");
        // true를 반환하면 다음으로 진행, false를 반환하면 요청 처리 중단
        return true;
    }

    // 컨트롤러에서 요청을 처리한 후, 뷰가 렌더링되기 전에 실행
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle: 컨트롤러에서 요청 처리 후, 뷰가 렌더링되기 전에 실행");
    }

    // 뷰가 렌더링된 후, 즉 모든 작업이 완료된 후 실행
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion: 뷰 렌더링 후 실행");
    }
}
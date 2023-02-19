package com.spring.master1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RequestInfo {
    @RequestMapping("/requestInfo")
    public void main(HttpServletRequest request) {
        System.out.println("request.getCharacterEncoding()="+request.getCharacterEncoding()); // ��û ������ ���ڵ�
        System.out.println("request.getContentLength()="+request.getContentLength());  // ��û ������ ����. �˼� ���� ���� -1
        System.out.println("request.getContentType()="+request.getContentType()); // ��û ������ Ÿ��. �� �� ���� ���� null

        System.out.println("request.getMethod()="+request.getMethod());      // ��û ���
        System.out.println("request.getProtocol()="+request.getProtocol());  // ���������� ������ ���� HTTP/1.1
        System.out.println("request.getScheme()="+request.getScheme());      // ��������

        System.out.println("request.getServerName()="+request.getServerName()); // ���� �̸� �Ǵ� ip�ּ�
        System.out.println("request.getServerPort()="+request.getServerPort()); // ���� ��Ʈ
        System.out.println("request.getRequestURL()="+request.getRequestURL()); // ��û URL
        System.out.println("request.getRequestURI()="+request.getRequestURI()); // ��û URI

        System.out.println("request.getContextPath()="+request.getContextPath()); // context path
        System.out.println("request.getServletPath()="+request.getServletPath()); // servlet path
        System.out.println("request.getQueryString()="+request.getQueryString()); // ���� ��Ʈ��

        System.out.println("request.getLocalName()="+request.getLocalName()); // ���� �̸�
        System.out.println("request.getLocalPort()="+request.getLocalPort()); // ���� ��Ʈ

        System.out.println("request.getRemoteAddr()="+request.getRemoteAddr()); // ���� ip�ּ�
        System.out.println("request.getRemoteHost()="+request.getRemoteHost()); // ���� ȣ��Ʈ �Ǵ� ip�ּ�
        System.out.println("request.getRemotePort()="+request.getRemotePort()); // ���� ��Ʈ
    }
}

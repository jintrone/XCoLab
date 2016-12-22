package org.xcolab.entity.utils.portlet.session;

import org.xcolab.entity.utils.portlet.PortletUtil;

import java.util.Iterator;

import javax.portlet.PortletRequest;

public class SessionErrors {

    private static  String _CLASS_NAME = "com.liferay.portal.kernel.servlet.";

    public static void add(PortletRequest portletRequest, String key){
        SessionHelper.add(PortletUtil.getHttpServletRequest(portletRequest),key,_CLASS_NAME);
    }

    public static Iterator<String> iterator(PortletRequest portletRequest){
        return SessionHelper.iterator(PortletUtil.getHttpServletRequest(portletRequest).getSession(true),_CLASS_NAME);
    }
    public static void clear(PortletRequest portletRequest) {
        SessionHelper.clear(PortletUtil.getHttpServletRequest(portletRequest).getSession(true),_CLASS_NAME);
    }
    public static boolean isEmpty(PortletRequest portletRequest) {
        return SessionHelper.isEmpty(PortletUtil.getHttpServletRequest(portletRequest).getSession(true),_CLASS_NAME);
    }
}
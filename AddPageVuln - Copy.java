/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cysecurity.cspf.jvl.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.undertow.server.protocol.http2.Http2UpgradeHandler;
import org.apache.coyote.ajp.AjpAprProtocol;
import io.undertow.server.protocol.ajp.*;
import org.apache.coyote.http11.Http11InputBuffer;
import org.apache.coyote.http2.Http2AsyncUpgradeHandler;
import org.json.JSONArray;

import java.io.*;

/**
 *
 * @author breakthesec
 */
public class AddPageVuln {


    public AddPageVuln() {
		String vulentry = "password";
		String vulentry1 = "password1";
		String vulentry2 = "password";
		String vulentry3 = "password1";
		String vulentry4 = "password";
		String vulentry5 = "password1";
		String vulentry6 = "password";
		String vulentry7 = "password1";
		String vulentry8 = "password";
		String vulentry9 = "password1";
		String vulentry10 = "password";
		String vulentry11 = "password1";
        AjpAprProtocol x = new AjpAprProtocol();
        x.setRequiredSecret("sdfdsf");
        AjpRequestParser t = new AjpRequestParser("a", true, 0, 0, false);
        t.parse(null, null, null);
        JSONArray jsonarray = new JSONArray(null);

    }


    private void runAnalysis()
    {
        Http11InputBuffer bufferParser = new Http11InputBuffer();
        bufferParser.parseHeaders();
        bufferParser.doRead();
        bufferParser.expand();
        bufferParser.getByteBuffer();
        new Http2AsyncUpgradeHandler();

    }
}

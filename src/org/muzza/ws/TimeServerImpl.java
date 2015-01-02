/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.ws;

import java.util.Date;
import javax.jws.WebService;

/**
 *
 * @author M Mozammil
 */
@WebService(endpointInterface = "org.muzza.ws.TimeServer")
public class TimeServerImpl implements TimeServer{

    @Override
    public String getServerTime() {
        return new Date().toString();
    }

    @Override
    public long getElapsedTime() {
        return new Date().getTime();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author M Mozammil
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface TimeServer {
    @WebMethod String getServerTime();
    @WebMethod long getElapsedTime();
}

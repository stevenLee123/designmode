/**
 * @author Steven
 * @create 2019/10/13 12:16
 * @Description:
 */
package com.steven.designmode.interceptingfilter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}

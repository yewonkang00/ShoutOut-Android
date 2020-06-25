package com.example.kimmessicorp;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

public class cviewRequest extends StringRequest {

    //서버 URL 설정 (PHP 파일 연동)
    final static private String URL = "http://kimmessi.dothome.co.kr/cpost.php";
    private Map<String, String> map;

    public cviewRequest(int c_BBS_NO, Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("c_BBS_NO",c_BBS_NO + "");

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }

}

package com.seamless.dji;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin
public class DJI extends Plugin {
    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", value);
        call.success(ret);
        
    }

    @PluginMethod()
    public void onReceive(PluginCall call) {
      int[] videoBuffer = call.getArray("videoBuffer");
      int length = call.getNumber("length");

      // more logic
      JSObject ret = new JSObject();
      ret.put("videoBuffer", videoBuffer);
      ret.put("length", length);
      call.resolve(ret);
    }

    @PluginMethod()
    public void getDisplayName(PluginCall call) {
      String displayName = call.getString("displayName");

      // more logic
      JSObject ret = new JSObject();
      ret.put("displayName", displayName);
      call.resolve(ret);
    }
}

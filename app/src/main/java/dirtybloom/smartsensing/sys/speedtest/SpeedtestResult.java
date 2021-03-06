package dirtybloom.smartsensing.sys.speedtest;

import android.os.Bundle;

import dirtybloom.smartsensing.sys.SysBundle;
import dirtybloom.smartsensing.sys.SysConstants;

/**
 * Created by dirtybloom on 30/06/2015.
 */
public class SpeedtestResult extends SysBundle {

    public static final String DOWNLOAD_SPEED_KEY = SysConstants.KEY + "EXTRA_DOWNLOAD_SPEED";

    public static final String UPLOAD_SPEED_KEY = SysConstants.KEY + "EXTRA_UPLOAD_SPEED";

    public static final String LATENCY_KEY = SysConstants.KEY + "EXTRA_LATENCY";

    public static final String DBM_KEY = SysConstants.KEY + "EXTRA_DBM";

    public static final String NETWORK_OPERATOR_NAME_KEY = SysConstants.KEY + "EXTRA_NETWORK_OPERATOR_NAME";

    public static final String NETWORK_CLASS_KEY = SysConstants.KEY + "EXTRA_NETWORK_CLASS";

    public static final String MANUFACTURER_KEY = SysConstants.KEY + "EXTRA_MANUFACTURER";

    public static final String MODEL_KEY = SysConstants.KEY + "EXTRA_MODEL";

    public static final String ERROR_KEY = SysConstants.KEY + "EXTRA_ERROR";


    public SpeedtestResult(Bundle bundle) {
        super(bundle);
    }

    public String getDownloadSpeed(){
        return bundle.getString(DOWNLOAD_SPEED_KEY);
    }

    public void setDownloadSpeed(String downloadSpeed){
        bundle.putString(DOWNLOAD_SPEED_KEY, downloadSpeed);
    }

    public float getUploadSpeed(){
        return bundle.getFloat(UPLOAD_SPEED_KEY);
    }

    public void setUploadSpeed(String uploadSpeed){
        bundle.putString(UPLOAD_SPEED_KEY, uploadSpeed);
    }

    public String getLatency(){
        return bundle.getString(LATENCY_KEY);
    }

    public void setLatency(String latency){
        bundle.putString(LATENCY_KEY, latency);
    }

    public String getDbm(){
        return bundle.getString(DBM_KEY);
    }

    public void setDbm(String dbm){
        bundle.putString(DBM_KEY,dbm);
    }

    public String getNetworkClass(){
        return bundle.getString(NETWORK_CLASS_KEY);
    }

    public void setNetworkClass(String networkClass){
        bundle.putString(NETWORK_CLASS_KEY,networkClass);
    }

    public String getNetworkOperatorName(){
        return bundle.getString(NETWORK_OPERATOR_NAME_KEY);
    }

    public void setNetworkOperatorName(String networkOperatorName){
        bundle.putString(NETWORK_OPERATOR_NAME_KEY,networkOperatorName);
    }

    public String getManufacturer(){
        return bundle.getString(MANUFACTURER_KEY);
    }

    public void setManufacturer(String manufacturer){
        bundle.putString(MANUFACTURER_KEY,manufacturer);
    }

    public String getModel(){
        return bundle.getString(MODEL_KEY);
    }

    public void setModel(String model){
        bundle.putString(MODEL_KEY,model);
    }

    public String getError(){
        return bundle.getString(ERROR_KEY);
    }

    public void setError(String error){
        bundle.putString(ERROR_KEY,error);
    }
}

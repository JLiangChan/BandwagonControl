package xyz.yxwzyyk.bandwagoncontrol.host;

/**
 * Created by yyk on 12/20/15.
 */
public class Exec {

    /**
     * error : 0
     * message : aquota.group
     aquota.user
     bin
     boot
     dev
     etc
     home
     lib
     lost+found
     media
     mnt
     opt
     proc
     root
     run
     sbin
     selinux
     srv
     sys
     tmp
     usr
     var

     */

    private int error;
    private String message;

    public void setError(int error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}

package jp.shipper.app.utils;

import android.util.Log;

public class Logger {

    /** Turn off the log */
    public static final int LEVEL_DISABLED = 0;

    /** Log level debug, all ERROR items wills be printed */
    public static final int LEVEL_ERROR = 1;

    /** Log level debug, all WARN, ERROR items will be printed */
    public static final int LEVEL_WARNING = 2;

    /** Log level debug, all INFO, WARN, ERROR items will be printed */
    public static final int LEVEL_INFORMATION = 3;

    /** Log level debug, all DEBUG, INFO, WARN, ERROR items will be printed */
    public static final int LEVEL_DEBUG = 4;

    /**
     * Log level debug, all DEBUG, INFO, WARN, ERROR, VERBOSE items will be
     * printed
     */
    public static final int LEVEL_VERBOSE = 5;

    /** Indicates the current logging level */
    private static int mLogLevel = LEVEL_VERBOSE;

    public static void d(String tag, String message){
        if(mLogLevel >= LEVEL_DEBUG) {
            Thread currentThread = Thread.currentThread();
            String threadName = currentThread.getName();
            String className = currentThread.getStackTrace()[3].getClassName();
            String methodName = currentThread.getStackTrace()[3].getMethodName();
            int lineNumber = currentThread.getStackTrace()[3].getLineNumber();
            Log.d(tag, String.format("%s | [%s] | %s() | %s -> %s", threadName, className, methodName, lineNumber, message));
        }
    }

    public static void w(String tag, String message){
        if(mLogLevel >= LEVEL_WARNING) {
            Thread currentThread = Thread.currentThread();
            String threadName = currentThread.getName();
            String className = currentThread.getStackTrace()[3].getClassName();
            String methodName = currentThread.getStackTrace()[3].getMethodName();
            int lineNumber = currentThread.getStackTrace()[3].getLineNumber();
            Log.w(tag, String.format("%s | [%s] | %s() | %s -> %s", threadName, className, methodName, lineNumber, message));
        }
    }

    public static void i(String tag, String message){
        if(mLogLevel >= LEVEL_INFORMATION) {
            Thread currentThread = Thread.currentThread();
            String threadName = currentThread.getName();
            String className = currentThread.getStackTrace()[3].getClassName();
            String methodName = currentThread.getStackTrace()[3].getMethodName();
            int lineNumber = currentThread.getStackTrace()[3].getLineNumber();
            Log.i(tag, String.format("%s | [%s] | %s() | %s -> %s", threadName, className, methodName, lineNumber, message));
        }
    }

    public static void e(String tag, String message){
        if(mLogLevel >= LEVEL_ERROR) {
            Thread currentThread = Thread.currentThread();
            String threadName = currentThread.getName();
            String className = currentThread.getStackTrace()[3].getClassName();
            String methodName = currentThread.getStackTrace()[3].getMethodName();
            int lineNumber = currentThread.getStackTrace()[3].getLineNumber();
            Log.e(tag, String.format("%s | [%s] | %s() | %s -> %s", threadName, className, methodName, lineNumber, message));
        }
    }

}

package com.huidu.tinkertest3.tinker.info;


import com.huidu.tinkertest3.tinker.utils.AppUtils;
import com.huidu.tinkertest3.tinker.utils.ApplicationContext;

/**
 * we add BaseBuildInfo to loader pattern, so it won't change with patch!
 */
public class BaseBuildInfo {
    public static String TEST_MESSAGE = "I won't change with tinker patch!";
    public static String BASE_TINKER_ID = AppUtils.getTinkerIdValue(ApplicationContext.application);
}

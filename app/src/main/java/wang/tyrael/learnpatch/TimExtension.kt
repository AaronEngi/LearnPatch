package wang.tyrael.learnpatch

import android.content.Context

/**
 * Created by tyraelwang on 2018/8/22 0022.
 */

public fun Context.getVersioncode():Int{
    val packageManager = this.packageManager
    val packageInfo = packageManager.getPackageInfo(this.packageName, 0);
    return 1;
}
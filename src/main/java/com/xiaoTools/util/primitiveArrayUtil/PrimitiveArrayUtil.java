package com.xiaoTools.util.primitiveArrayUtil;

import com.xiaoTools.lang.constant.Constant;

/**
 * [原始类型数组工具类](Primitive type array utility class)
 * @description: zh - 原始类型数组工具类
 * @description: en - Primitive type array utility class
 * @version: V1.0
 * @author XiaoXunYao
 * @since 2021/8/10 4:53 下午
*/
public class PrimitiveArrayUtil {

    /* 数组是否为空 ------------------------------------------------------------------------------- Is Empty */

    /**
     * [数组是否为空](Array is empty)
     * @description: zh - 数组是否为空
     * @description: en - Array is empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/10 5:00 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isEmpty(long[] array) {
        return array == Constant.NULL || array.length == Constant.ZERO;
    }

    /**
     * [数组是否为空](Array is empty)
     * @description: zh - 数组是否为空
     * @description: en - Array is empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/10 5:01 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isEmpty(int[] array) {
        return array == Constant.NULL || array.length == Constant.ZERO;
    }

    /**
     * [数组是否为空](Array is empty)
     * @description: zh - 数组是否为空
     * @description: en - Array is empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/10 5:08 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isEmpty(char[] array) {
        return array == Constant.NULL || array.length == Constant.ZERO;
    }

    /**
     * [数组是否为空](Array is empty)
     * @description: zh - 数组是否为空
     * @description: en - Array is empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/10 5:09 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isEmpty(short[] array) {
        return array == Constant.NULL || array.length == Constant.ZERO;
    }

    /**
     * [数组是否为空](Array is empty)
     * @description: zh - 数组是否为空
     * @description: en - Array is empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/10 5:10 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isEmpty(byte[] array) {
        return array == Constant.NULL || array.length == Constant.ZERO;
    }

    /**
     * [数组是否为空](Array is empty)
     * @description: zh - 数组是否为空
     * @description: en - Array is empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/10 5:10 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isEmpty(double[] array) {
        return array == Constant.NULL || array.length == Constant.ZERO;
    }

    /**
     * [数组是否为空](Array is empty)
     * @description: zh - 数组是否为空
     * @description: en - Array is empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/10 5:11 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isEmpty(float[] array) {
        return array == Constant.NULL || array.length == Constant.ZERO;
    }

    /**
     * [数组是否为空](Array is empty)
     * @description: zh - 数组是否为空
     * @description: en - Array is empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/10 5:11 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isEmpty(boolean[] array) {
        return array == Constant.NULL || array.length == Constant.ZERO;
    }

    /* 数组是否为非空 ------------------------------------------------------------------------------- Is Not Empty */

    /**
     * [数组是否为非空](array is not empty)
     * @description: zh - 数组是否为非空
     * @description: en - array is not empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:03 下午
     * @param array: 数组
     * @return boolean
     */
    public static boolean isNotEmpty(int[] array) {
        return !isEmpty(array);
    }

    /**
     * [数组是否为非空](array is not empty)
     * @description: zh - 数组是否为非空
     * @description: en - array is not empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:02 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isNotEmpty(long[] array) {
        return !isEmpty(array);
    }

    /**
     * [数组是否为非空](array is not empty)
     * @description: zh - 数组是否为非空
     * @description: en - array is not empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:04 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isNotEmpty(short[] array) {
        return !isEmpty(array);
    }

    /**
     * [数组是否为非空](array is not empty)
     * @description: zh - 数组是否为非空
     * @description: en - array is not empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:05 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isNotEmpty(char[] array) {
        return !isEmpty(array);
    }

    /**
     * [数组是否为非空](array is not empty)
     * @description: zh - 数组是否为非空
     * @description: en - array is not empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:05 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isNotEmpty(byte[] array) {
        return !isEmpty(array);
    }

    /**
     * [数组是否为非空](array is not empty)
     * @description: zh - 数组是否为非空
     * @description: en - array is not empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:05 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isNotEmpty(double[] array) {
        return !isEmpty(array);
    }

    /**
     * [数组是否为非空](array is not empty)
     * @description: zh - 数组是否为非空
     * @description: en - array is not empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:05 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isNotEmpty(float[] array) {
        return !isEmpty(array);
    }

    /**
     * [数组是否为非空](array is not empty)
     * @description: zh - 数组是否为非空
     * @description: en - array is not empty
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:06 下午
     * @param array: 数组
     * @return boolean
    */
    public static boolean isNotEmpty(boolean[] array) {
        return !isEmpty(array);
    }

    /* 重新设置大小的数组 ------------------------------------------------------------------------------- resize*/

    /**
     * [生成一个新的重新设置大小的数组](Generates a new resized array)
     * @description: zh - 生成一个新的重新设置大小的数组
     * @description: en - Generates a new resized array
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:16 下午
     * @param bytes: 原数组
     * @param newSize: 新的数组大小
     * @return byte[]
    */
    public static byte[] resize(byte[] bytes, int newSize) {
        if (newSize < Constant.ZERO) {
            return bytes;
        }
        final byte[] newArray = new byte[newSize];
        if (newSize > Constant.ZERO && isNotEmpty(bytes)) {
            System.arraycopy(bytes, Constant.ZERO, newArray, Constant.ZERO, Math.min(bytes.length, newSize));
        }
        return newArray;
    }

    /* 多个数组合并在一起 ------------------------------------------------------------------------------- Add All*/

    /**
     * [将多个数组合并在一起](Merge multiple arrays together)
     * @description: zh - 将多个数组合并在一起
     * @description: en - Merge multiple arrays together
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:49 下午
     * @param arrays: 数组
     * @return byte[]
    */
    public static byte[] addAll(byte[]... arrays) {
        if (arrays.length == Constant.ONE) {
            return arrays[Constant.ZERO];
        }
        // 计算总长度
        int length = Constant.ZERO;
        for (byte[] array : arrays) {
            if (Constant.NULL != array) {
                length += array.length;
            }
        }
        final byte[] result = new byte[length];
        length = Constant.ZERO;
        for (byte[] array : arrays) {
            if (Constant.NULL != array) {
                System.arraycopy(array, Constant.ZERO, result, length, array.length);
                length += array.length;
            }
        }
        return result;
    }

    /**
     * [将多个数组合并在一起](Merge multiple arrays together)
     * @description: zh - 将多个数组合并在一起
     * @description: en - Merge multiple arrays together
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:52 下午
     * @param arrays: 数组
     * @return int[]
    */
    public static int[] addAll(int[]... arrays) {
        if (arrays.length == Constant.ONE) {
            return arrays[Constant.ZERO];
        }

        // 计算总长度
        int length = Constant.ZERO;
        for (int[] array : arrays) {
            if (Constant.NULL != array) {
                length += array.length;
            }
        }

        final int[] result = new int[length];
        length = Constant.ZERO;
        for (int[] array : arrays) {
            if (Constant.NULL != array) {
                System.arraycopy(array, Constant.ZERO, result, length, array.length);
                length += array.length;
            }
        }
        return result;
    }

    /**
     * [将多个数组合并在一起](Merge multiple arrays together)
     * @description: zh - 将多个数组合并在一起
     * @description: en - Merge multiple arrays together
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:54 下午
     * @param arrays: 数组
     * @return long[]
    */
    public static long[] addAll(long[]... arrays) {
        if (arrays.length == Constant.ONE) {
            return arrays[Constant.ZERO];
        }

        // 计算总长度
        int length = Constant.ZERO;
        for (long[] array : arrays) {
            if (Constant.NULL != array) {
                length += array.length;
            }
        }

        final long[] result = new long[length];
        length = Constant.ZERO;
        for (long[] array : arrays) {
            if (Constant.NULL != array) {
                System.arraycopy(array, Constant.ZERO, result, length, array.length);
                length += array.length;
            }
        }
        return result;
    }

    /**
     * [将多个数组合并在一起](Merge multiple arrays together)
     * @description: zh - 将多个数组合并在一起
     * @description: en - Merge multiple arrays together
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 8:57 下午
     * @param arrays: 数组
     * @return double[]
    */
    public static double[] addAll(double[]... arrays) {
        if (arrays.length == Constant.ONE) {
            return arrays[Constant.ZERO];
        }

        // 计算总长度
        int length = Constant.ZERO;
        for (double[] array : arrays) {
            if (Constant.NULL != array) {
                length += array.length;
            }
        }

        final double[] result = new double[length];
        length = Constant.ZERO;
        for (double[] array : arrays) {
            if (Constant.NULL != array) {
                System.arraycopy(array, Constant.ZERO, result, length, array.length);
                length += array.length;
            }
        }
        return result;
    }

    /**
     * [将多个数组合并在一起](Merge multiple arrays together)
     * @description: zh - 将多个数组合并在一起
     * @description: en - Merge multiple arrays together
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 9:03 下午
     * @param arrays: 数组
     * @return float[]
    */
    public static float[] addAll(float[]... arrays) {
        if (arrays.length == Constant.ONE) {
            return arrays[Constant.ZERO];
        }

        // 计算总长度
        int length = Constant.ZERO;
        for (float[] array : arrays) {
            if (Constant.NULL != array) {
                length += array.length;
            }
        }

        final float[] result = new float[length];
        length = Constant.ZERO;
        for (float[] array : arrays) {
            if (Constant.NULL != array) {
                System.arraycopy(array, Constant.ZERO, result, length, array.length);
                length += array.length;
            }
        }
        return result;
    }

    /**
     * [将多个数组合并在一起](Merge multiple arrays together)
     * @description: zh - 将多个数组合并在一起
     * @description: en - Merge multiple arrays together
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 9:04 下午
     * @param arrays: 数组
     * @return char[]
    */
    public static char[] addAll(char[]... arrays) {
        if (arrays.length == Constant.ONE) {
            return arrays[Constant.ZERO];
        }

        // 计算总长度
        int length = Constant.ZERO;
        for (char[] array : arrays) {
            if (Constant.NULL != array) {
                length += array.length;
            }
        }

        final char[] result = new char[length];
        length = Constant.ZERO;
        for (char[] array : arrays) {
            if (Constant.NULL != array) {
                System.arraycopy(array, Constant.ZERO, result, length, array.length);
                length += array.length;
            }
        }
        return result;
    }

    /**
     * [将多个数组合并在一起](Merge multiple arrays together)
     * @description: zh - 将多个数组合并在一起
     * @description: en - Merge multiple arrays together
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 9:05 下午
     * @param arrays: 数组
     * @return boolean[]
    */
    public static boolean[] addAll(boolean[]... arrays) {
        if (arrays.length == Constant.ONE) {
            return arrays[Constant.ZERO];
        }

        // 计算总长度
        int length = Constant.ZERO;
        for (boolean[] array : arrays) {
            if (null != array) {
                length += array.length;
            }
        }

        final boolean[] result = new boolean[length];
        length = Constant.ZERO;
        for (boolean[] array : arrays) {
            if (null != array) {
                System.arraycopy(array, Constant.ZERO, result, length, array.length);
                length += array.length;
            }
        }
        return result;
    }

    /**
     * [将多个数组合并在一起](Merge multiple arrays together)
     * @description: zh - 将多个数组合并在一起
     * @description: en - Merge multiple arrays together
     * @version: V1.0
     * @author XiaoXunYao
     * @since 2021/8/12 9:07 下午
     * @param arrays: 数组
     * @return short[]
    */
    public static short[] addAll(short[]... arrays) {
        if (arrays.length == Constant.ONE) {
            return arrays[Constant.ZERO];
        }

        // 计算总长度
        int length = Constant.ZERO;
        for (short[] array : arrays) {
            if (Constant.NULL != array) {
                length += array.length;
            }
        }

        final short[] result = new short[length];
        length = Constant.ZERO;
        for (short[] array : arrays) {
            if (Constant.NULL != array) {
                System.arraycopy(array, Constant.ZERO, result, length, array.length);
                length += array.length;
            }
        }
        return result;
    }
}

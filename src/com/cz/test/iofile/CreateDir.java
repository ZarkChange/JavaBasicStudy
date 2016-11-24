package com.cz.test.iofile;

import java.io.File;
/**
 * 创建目录
 * mkdir() 方法创建一个目录，在成功时返回假失败真的。失败表明，
 * 		          在文件对象中指定的路径已经存在，或者该目录不能被创建，因为整个路径尚不存在。
 * mkdirs() 方法同时创建一个目录和目录下的所有父目录
 * @author admin
 *
 */
public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirname="/tmp/user/java/bin";
				File d=new File(dirname);
				d.mkdirs();
	}

}

package com.coretek.pack.internal.ihandler;

public interface IPackWorker extends Runnable {
	
	/**
	 * 
	 * @return
	 */
	String getLogInfo();
	
	boolean isRunning();
	
	boolean isSuccess();
	
	String getoutputpackpath();
	
	String getSetupZipName(); 

	/**
	 * svn导出平台文件
	 * @param svnNetPath svn路径 指向顶级目录  LambdaPRO级
	 * @param exportLocalPath
	 * @return
	 */
	boolean exportPlatformFromSVN(String svnNetPath,String exportLocalPath);
	
	/**
	 * 构建导出插件
	 * @param pluginsSrcPath
	 * @param pluginsBuildOutPath
	 * @return
	 */
	boolean buildPlugins(String pluginsSrcPath,String pluginsBuildOutPath,int packmodeId);
	
	/**
	 * 构建库文件，并复制到对应的目录
	 * @param srcPath
	 * @param libarysBuildOutPath
	 * @return
	 */
	boolean buildOSLibarys(String srcPath,String libarysBuildOutPath);
	
	/**
	 * 平台加密
	 * @param platformPath
	 * @return
	 */
	boolean platformEncrypt(String platformPath);
	
	/**
	 * 平台打包
	 * @param platformPath
	 * @param platfomPackPath
	 * @return
	 */
	boolean platformPack(String platformPath,String platfomPackPath,int packModeId);
	
}

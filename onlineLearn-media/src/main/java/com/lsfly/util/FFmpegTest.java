package com.lsfly.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cc.eguid.FFmpegCommandManager.FFmpegManager;
import cc.eguid.FFmpegCommandManager.FFmpegManagerImpl;
import cc.eguid.FFmpegCommandManager.entity.TaskEntity;
/**
 * 测试
 * @author eguid
 * @since jdk1.7
 * @version 2017年10月13日
 */
public class FFmpegTest {
	/**
	 * 命令组装器测试
	 * @throws InterruptedException
	 */
	public static void test1() throws InterruptedException{
		FFmpegManager manager = new FFmpegManagerImpl();
		Map<String,String> map = new HashMap<String,String>();
		map.put("appName", "test123");
		map.put("input", "rtsp://admin:admin@192.168.2.236:37779/cam/realmonitor?channel=1&subtype=0");
		map.put("output", "rtmp://192.168.30.21/live/");
		map.put("codec", "h264");
		map.put("fmt", "flv");
		map.put("fps", "25");
		map.put("rs", "640x360");
		map.put("twoPart", "2");
		// 执行任务，id就是appName，如果执行失败返回为null
		String id = manager.start(map);
		System.out.println(id);
		// 通过id查询
		TaskEntity info = manager.query(id);
		System.out.println(info);
		// 查询全部
		Collection<TaskEntity> infoList = manager.queryAll();
		System.out.println(infoList);
		Thread.sleep(30000);
		// 停止id对应的任务
		 manager.stop(id);
	}
	/**
	 * 默认方式，rtsp->rtmp转流单个命令测试
	 * @throws InterruptedException
	 */
	public static void test2() throws InterruptedException{
		FFmpegManager manager = new FFmpegManagerImpl();
		// -rtsp_transport tcp 
		//测试多个任何同时执行和停止情况
		//默认方式发布任务
		manager.start("tomcat", "ffmpeg -i rtsp://admin:admin123@192.168.18.204:554/h264/ch1/main/av_stream -vcodec copy -acodec copy -f flv -y rtmp://localhost:1935/hls/tomcat");
		
		Thread.sleep(30000);
		// 停止全部任务
		manager.stopAll();
	}

	/**
	 * @throws InterruptedException
	 */
	public static void test5() throws InterruptedException{
		FFmpegManager manager = new FFmpegManagerImpl();
		// -rtsp_transport tcp
		//测试多个任何同时执行和停止情况
		//默认方式发布任务
		manager.start("tomcat", "ffmpeg -i http://sxws.chinashadt.com:1936/live/tv5.stream_360p/playlist.m3u8 -c:v libx264 -c:a aac -strict -2 -f flv rtmp://localhost:1935/hls/tomcat");

		Thread.sleep(30000);
		// 停止全部任务
		manager.stopAll();
	}
	/**
	 * 完整ffmpeg路径测试
	 * @throws InterruptedException
	 */
	public static void test4() throws InterruptedException{
		FFmpegManager manager = new FFmpegManagerImpl();
		// -rtsp_transport tcp 
		//测试多个任何同时执行和停止情况
		//默认方式发布任务
		manager.start("tomcat", "D:/TestWorkspaces/FFmpegCommandHandler/src/cc/eguid/FFmpegCommandManager/ffmpeg/ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat",true);
		
		Thread.sleep(30000);
		// 停止全部任务
		manager.stopAll();
	}
	
	/**
	 * rtsp-rtmp转流多任务测试
	 * @throws InterruptedException
	 */
	public static void test3() throws InterruptedException{
		FFmpegManager manager = new FFmpegManagerImpl();
		// -rtsp_transport tcp 
		//测试多个任何同时执行和停止情况
		//false表示使用配置文件中的ffmpeg路径，true表示本条命令已经包含ffmpeg所在的完整路径
		manager.start("tomcat", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat",false);
		manager.start("tomcat1", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat1",false);
		manager.start("tomcat2", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat2",false);
		manager.start("tomcat3", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat3",false);
		manager.start("tomcat4", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat4",false);
		manager.start("tomcat5", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat5",false);
		manager.start("tomcat6", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat6",false);
		manager.start("tomcat7", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat7",false);
		manager.start("tomcat8", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat8",false);
		manager.start("tomcat9", "ffmpeg -i rtsp://184.72.239.149/vod/mp4://BigBuckBunny_175k.mov -vcodec copy -acodec copy -f flv -y rtmp://106.14.182.20:1935/rtmp/tomcat9",false);
		
		Thread.sleep(30000);
		// 停止全部任务
		manager.stopAll();
	}
	public static void main(String[] args) throws InterruptedException {
		//test1();
		//test5();
//		test3();
//		test4();
		FFmpegManager manager = new FFmpegManagerImpl();
		TaskEntity info = manager.query("037E5C63CFFE49619307C4201A72D45F");
		System.out.println(info);
	}
}

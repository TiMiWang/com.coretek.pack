package com.coretek.pack.handler;

import com.coretek.pack.model.PackMode;
import com.coretek.pack.service.IPackModeService;

public interface IPackWorkerManager {

	IPackWorker getPackWorker(Integer id);
	
	void removePackWorker(Integer id);
	
	IPackWorker createPackWorker(PackMode packmode,IPackModeService packModeService,String resourcePath);
	
	void packWorkerWorking(IPackWorker packworker);
}
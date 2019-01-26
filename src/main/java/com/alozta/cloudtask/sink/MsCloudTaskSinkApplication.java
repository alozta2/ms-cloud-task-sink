package com.alozta.cloudtask.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class MsCloudTaskSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCloudTaskSinkApplication.class, args);
	}

}


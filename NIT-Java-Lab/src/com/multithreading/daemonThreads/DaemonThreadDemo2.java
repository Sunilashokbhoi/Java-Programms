package com.multithreading.daemonThreads;

public class DaemonThreadDemo2 {
	public static void main(String[] args) {
		Thread daemonThread = new Thread(() -> {
			while (true) {
				String name = Thread.currentThread().getName();
				System.out.println("Running Thread Name is :" + name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		daemonThread.setName("Daemon");
		daemonThread.setDaemon(true);
		daemonThread.start();

		Thread userThread = new Thread(() -> {
			String name = Thread.currentThread().getName();

			for (int i = 0; i <= 20; i++) {
				System.out.println(i + " by " + name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		userThread.setName("User_Name");
		userThread.start();
	}
}

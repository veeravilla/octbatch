package com.test.oops.v1;

public class BMW  extends Car{

		public void navigation(){
			System.out.println(" BMW ## Navigation()");
		}

		@Override
		public void start() {
			System.out.println(" BMW ## Start() ");
		}

		@Override
		public void stop() {
			super.stop();
			System.out.println(" BMW ## Stop() ");
		}
		
		
}

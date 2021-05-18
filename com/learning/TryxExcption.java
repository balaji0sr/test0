package com.learning;

public class TryxExcption {
	String test = "no";
			try {
			Systern.out.println("start try");
			doRisky(test);
			System.out.println("end try");
			} catch ( ScaryException se) {
			Systern.out.println("sca:r:yexception");
			} finally {
			System. out. println( "finally") ;
			}
			System.out.println("end of main");
			}
			static void doRisky(String test) throws ScaryException {
			System.out.println ("start risky");
			if ("yes".equals(test)) {
			throw new ScaryException();
			System.out.println("end risky");
			return;
			}
}
}
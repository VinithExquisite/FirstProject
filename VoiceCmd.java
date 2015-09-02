  
            if (microphone.startRecording())
            {	
            	System.out.println("Say: (Command | Program| Browser | Bluetooth |  Device Manager |Power Options |Cal | Control | Player |task manager | Windows Security Center)");
            	System.out.println("Say: ( open word | open phot oshop|open Access|start Excel|start nero |start fire wall| open Pad |open Paint)");
            while (true) 
            {
            	
            	
		    System.out.println("Start speaking. Press Ctrl-C to quit.\n");

                    /*
                     * This method will return when the end of speech
                     * is reached. Note that the endpointer will determine
                     * the end of speech.
                     */ 
		  
		 
		    Result result = recognizer.recognize();
		    if (result != null)
		    {
		    	
		    		System.out.println("Enter your choice"+ "\n");
			 resultText = result.getBestFinalResultNoFiller();
			System.out.println("You said: " + resultText + "\n");
			
			if(resultText.equalsIgnoreCase("command"))
 			{
 				try{
 				Process p;
 				//resultText="";
 				p = Runtime.getRuntime().exec("cmd /c start cmd");
 				//System.out.println("You said");
 				
 				 //resultText = result.getBestFinalResultNoFiller();
 				//System.out.println("You said: " + resultText + "\n");
 				
 				}catch(Exception er)
 				{}
 			}if (resultText.equalsIgnoreCase("close command"))
 		    {
 		        try{
 		        Process p;	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start taskkill /im cmd.exe /f");
 		     
 		        }catch(Exception ae){}
 		    }
 			if (resultText.equalsIgnoreCase("Power Options"))
 		    {
 		        try{
 		        Process p;	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c powercfg.cpl");
 		     
 		        }catch(Exception ae){}
 		    }
 			if (resultText.equalsIgnoreCase("Blue"))
 		    {
 		        try{
 		        Process p;	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c fsquirt");
 		     
 		        }catch(Exception ae){}
 		    }
 			if (resultText.equalsIgnoreCase("start photo shop"))
 		    {
 		        try{
 		        Process p;	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start photoshop");
 		     
 		        }catch(Exception ae){}
 		    }
 			if (resultText.equalsIgnoreCase("calculator"))
 		    {
 		        try{
 		        Process p;	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start calc");
 		     
 		        }catch(Exception ae){}
 		    }

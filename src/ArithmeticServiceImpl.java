import org.apache.thrift.TException;

public class ArithmeticServiceImpl  implements ArithmeticService.Iface {
	 	@Override
	    public long add(int num1, int num2) throws TException {
	 		System.out.println("num1+num2 is:" + num1+num2);
	        return num1 + num2;
	        
	 		//return 0;
	    }

	    @Override
	    public long multiply(int num1, int num2) throws TException {
	    	System.out.println("Multiply result: " + (num1-num2)*100);
	        return (num1-num2)*100;
	    }

		@Override
		public String SetPolicy(String policy) throws TException {
			//Policy _policy = Newtonsoft.Json.JsonConvert.DeserializeObject<Policy>(policy);
			
			String XenServerAgent_ReturnMessage = "OK";
			
			//String Result = Newtonsoft.Json.JsonConvert.SerializeObject(XenServerAgent_ReturnMessage);
			return XenServerAgent_ReturnMessage ;
		}
}



package my.project.design;

import org.eclipse.emf.ecore.EObject;

import ocl_final.Contract;
import ocl_final.Ocl_finalFactory;
import ocl_final.Service;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public String returnServiceString(Service self) {
        // TODO Auto-generated code
    	return "123";
//       return "Service:" + self.getName();
    }
    
    public String returnContractString(Contract self) {
        // TODO Auto-generated code
       return "Contract:" + self.getName();
    }
    
    public void createContract(EObject self,Service eobject) {
    	System.out.println("2333");
    	Contract c = Ocl_finalFactory.eINSTANCE.createContract();
    	((Service)eobject).getContract().add(c);
//    	if(eobject instanceof Service) {
//        	Contract c = Ocl_finalFactory.eINSTANCE.createContract();
//        	((Service)eobject).getContract().add(c);
//    	}
        // TODO Auto-generated code

//    			ocl_final
     }
}

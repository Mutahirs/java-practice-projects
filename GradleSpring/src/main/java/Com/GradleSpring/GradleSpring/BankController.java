package Com.GradleSpring.GradleSpring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/index")
public class BankController {

   public ArrayList<BankApp> bank = new ArrayList<BankApp>();
    public int temp;
    @GetMapping("/one")//to get all bank accounts
    public List<BankApp> index(BankApp app) {
        //ArrayList<BankApp> a = new ArrayList<>();
        for (BankApp banks : bank) {
            System.out.println(bank);
        }
        return bank;
    }

   @GetMapping("/two")//to get accounts by searching
    public BankApp bankDetails(@RequestParam int accountNumber, @RequestParam String accHolderName) {
        BankApp b1 = new BankApp("Mutahir", 9991, 25);
        BankApp b2 = new BankApp("ravi", 9992, 27);
        //b2.accHolderName= b2.accHolderName+accHolderName;
        if (accountNumber == 9991) {
            return b1;
        } else {
            return b2;
        }
    }

    @GetMapping("/three/{accountNumber}/{accHolderName}")//pathvariable to get details by acc number and name
    public BankApp getBankDetails(@PathVariable int accountNumber) {
        BankApp b3 = new BankApp("Mohan", 9993, 26);
       return b3;
    }

    /*@RequestMapping (method=RequestMethod.POST,value = "/four")
    public int  addValue(@RequestBody int accNum){


        return accNum;
    }*/

    @PostMapping(value = "/four")//adding accounts by post request
    public List<BankApp> addValue(@RequestBody BankApp bankApp) {
        BankApp bank1 = new BankApp(bankApp.accHolderName, bankApp.accountNumber, bankApp.age);
        bank.add(bank1);


        for (BankApp ap : bank) {

            System.out.println(ap.accHolderName + ap.accountNumber + ap.age);
        }

        return bank;

    }

   /*@PostMapping (value = "/four")
    public String addAccount(@RequestBody BankApp bankApp){
        BankApp b=new BankApp(bankApp.accHolderName,bankApp.accountNumber,bankApp.age);
         bank.add(b);

        return "updated";
    }*/



    @PutMapping(value = "/five")//put request
    public String putValue(@RequestBody BankApp updateValue) {


        return updateValue.accHolderName;
    }

    @GetMapping("/search")//seraching the updated accounts by acc number
    public List<BankApp> getAccDetails(@RequestParam int accountNumber) {
    for(BankApp banks:bank){

        if(accountNumber==banks.accountNumber){
            return bank;
        }
    }
    return null;
  }

    @DeleteMapping ("/delete/{accountNumber}")//deleting the accounts
    public String delAccDetails(@PathVariable(value = "accountNumber") int accountNumber ){
        for(BankApp banks:bank){

            if(banks.accountNumber==accountNumber){
                System.out.println("valid to delete");

                bank.remove(banks);
                return "Deleted Successfully";

            }
            /*else{
                System.out.println("not valid to delete");
                return "Invalid Account Number";
            }*/
        }
return null;
    }

}






# App #3: "The Always Correct Money Transfer" :moneybag:

The Always Correct Money Transfer application allows you to safely and conveniently transfer money from one account to the other.  
It keeps your account safe and only withdraws the amount it should.

To test that it is working properly, running our app will transfer 5$ from `Foo` account to `Bar` and 5$ from `Bar` account to `Foo`.  
After completing it will print out the current balance of each account.

## Cloning the repo

Git clone `jvmworkshop23`  

`git clone git@github.com:shays10/jvmworkshop23.git`

## :computer: Running locally 

In your terminal navigate to `MoneyTransfer`, execute `./compile.sh` and `./run.sh`.  
(Compiling might take 2-3 minutes..).  

Your app is now running but never completes.

## :mag_right: Gathering evidence

While your app is still running - In a new terminal, take a thread dump using `jstack <PID>`.  
You can use `jps` to locate your PID.   


Investigate the results.

## :hammer: Fixing the issue  

You figured out what went wrong, awesome!  
Open the source code in your favorite IDE (load the `pom.xml`) and try to fix the problem (while keeping our app "Always correct"!). 
Rerun the app and make sure it completes successfully.

Hint [is here](solution/Hint.md)

Solution [is here](solution/Solution.md)

## :fast_forward: One more app to go! 
Let's continue to [App #4: "The Lightweight City Retriever"](../CityRetriever/README.md)


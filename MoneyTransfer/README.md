# App #3: "The Always Correct Money Transfer" :moneybag:

## :sparkles: Introduction

This app is basically the same app we took a thread dump from earlier (app #1).  
But this time, we'll deep-dive, inspect it locally and fix it!

`The Always Correct Money Transfer` application allows you to safely and conveniently transfer money from one account to the other.  
It keeps your account safe and only withdraws the amount it should.

When running the application, it will:  
Transfer 5$ from `Foo` account to `Bar` and.  
Transfer 5$ from `Bar` account to `Foo`.  

After completing it will print out the current balance of each account.

## :arrow_heading_down: Cloning the repo

Git clone `jvmworkshop23`  

`git clone git@github.com:shays10/jvmworkshop23.git`

## :computer: Running locally 

In your terminal navigate to the `MoneyTransfer` folder found in the root of the repo.  
Execute `./compile.sh` and `./run.sh`.  
(Compiling might take 2-3 minutes..).  

Your app is now running but never completes.  
Let's keep it running and investigate.

## :mag_right: Gathering evidence

While your app is still running - In a new terminal, take a thread dump using `jstack <PID>`.  
You can use `jps` to locate your PID.   


Investigate the results. This should look rather familiar :)   

## :hammer: Fixing the issue  

Open the source code in your favorite IDE (open `/MoneyTransfer/pom.xml` in IntelliJ, for example) and try to fix the problem, while keeping the correctness of the app. 

Rerun the app and make sure it completes successfully.

> **Note**  
>
> For the sake of this workshop, we recommend opening the code in a Text Editor/IDE and running it with `./compile.sh` and `./run.sh`. 
> It will prevent possible issues with IDEs not properly configuring Scala/Maven projects out of the box.  

Hint [is here](solution/Hint.md)

Solution [is here](solution/Solution.md)

## :fast_forward: One more app to go! 
Let's continue to [App #4: "The Lightweight City Retriever"](../CityRetriever/README.md)


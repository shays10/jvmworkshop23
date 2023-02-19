# "The Always Correct Money Transfer App" - Hint


## Oh no, a deadlock!

As you already figured out, our app isn't working properly as it never completes.  

We ran a thread dump and discovered that we have a deadlock.  

```
Found one Java-level deadlock:
=============================
"Thread-0":
  waiting to lock monitor 0x0000600001ae05b0 (object 0x00000007ef826498, a com.workshop.money.model.Account),
  which is held by "Thread-1"

"Thread-1":
  waiting to lock monitor 0x0000600001afc680 (object 0x00000007ef81cb28, a com.workshop.money.model.Account),
  which is held by "Thread-0"

Java stack information for the threads listed above:
===================================================
"Thread-0":
	at com.workshop.money.bankmanager.ResilientTransferManager.transfer(ResilientTransferManager.scala:12)
	- waiting to lock <0x00000007ef826498> (a com.workshop.money.model.Account)
	- locked <0x00000007ef81cb28> (a com.workshop.money.model.Account)
	at com.workshop.money.MoneyTransfer$.$anonfun$main$2(MoneyTransfer.scala:16)
	at com.workshop.money.MoneyTransfer$$$Lambda$7/0x00000008010b6ab8.apply$mcVI$sp(Unknown Source)
	at scala.collection.immutable.Range.foreach$mVc$sp(Range.scala:156)
	at com.workshop.money.MoneyTransfer$.$anonfun$main$1(MoneyTransfer.scala:16)
	at com.workshop.money.MoneyTransfer$$$Lambda$5/0x00000008010ade00.run(Unknown Source)
	at java.lang.Thread.run(java.base@19.0.1/Thread.java:1589)
"Thread-1":
	at com.workshop.money.bankmanager.ResilientTransferManager.transfer(ResilientTransferManager.scala:12)
	- waiting to lock <0x00000007ef81cb28> (a com.workshop.money.model.Account)
	- locked <0x00000007ef826498> (a com.workshop.money.model.Account)
	at com.workshop.money.MoneyTransfer$.$anonfun$main$4(MoneyTransfer.scala:19)
	at com.workshop.money.MoneyTransfer$$$Lambda$8/0x00000008010b6ea0.apply$mcVI$sp(Unknown Source)
	at scala.collection.immutable.Range.foreach$mVc$sp(Range.scala:156)
	at com.workshop.money.MoneyTransfer$.$anonfun$main$3(MoneyTransfer.scala:19)
	at com.workshop.money.MoneyTransfer$$$Lambda$6/0x00000008010ae010.run(Unknown Source)
	at java.lang.Thread.run(java.base@19.0.1/Thread.java:1589)
```

## Why?

In order to protect our accounts we have to make sure our `transfer` method is atomic.   
In order to make sure no other thread is modifying either account concurrently, we are invoking `synchronized` on both accounts.  

By doing so we created a deadlock since our threads are acquiring resources and then cyclically try to acquire 
other thread's resources without releasing their own. In short, we have a cycle. 

Whenever resources are acquired in the **same** order there is no danger of deadlock.  

Fix your app so your locks will be properly ordered - so no cycle can occur.

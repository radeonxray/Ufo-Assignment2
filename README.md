# Ufo-Assignment2

### Exercise 1
Chose to run PMD on an old 1 semester JAVA text-adventure dungeon game. Specifically, PMD was run on the “GameControl”-java file found in the control folder, which handles all the logistics of the game and that consist of over 1000+ lines of code. The project was originally writing by 3 people: Myself (Christian), Bjørn and Hannibal, in a periode of about 3 weeks if I remember correctly.

The following reports were generated on the “GameControl”-java file and the number of problems found: 
* bestpratices - 35 problems 
* codestyle - 20 problems
* performance - 0 problems
* errorprone - 397 problems
* security - 0 problems

---

* 1
[Errorprone-report] 

A lot errors with the description 
>”DD - Anomaly: A recently defined variable is redefined. This is ominous but don’t have to be a bug.”

One of the reasons this problem is shown, is because that rooms are assigned/connected to each other, after the fact that the room-objects have been individually initialized earlier in the startup of the project. I assume that PMD is warning about changing an objects properties, after the object have been initialized and that doing that is a bad practice that can lead to error prone code.
This problem is found in over 80 instances in the report.

---

* 2
[Errorprone-report] 

With over 150 instances, the 
>“Assigning an Object to null is a code smell. Consider refactoring.” 

is the most common problem found in the error-report. The reason for this problem triggering, is that when the rooms are being assigned their connecting room and if there is no room to a direction of the room (North, South East or West), the direction is assigned with a “null”, after the rooms have been initialized, and such we are changing the properties of the object. The game-engine reads “null” as a wall, and so if the player tries to walk in a direction in which there are no rooms, the game tells the player that they’ve hit a wall and and have not left the latest room.
According the PMD:

>“Assigning a “null” to a variable (outside of its declaration) is usually bad form. Sometimes, this type of assignment is an indication that the programmer doesn’t completely understand what is going on in the code.”

While PMD has a point with programmers using null as a “end point/dead end, because we don’t know what to do from here”, in this case, the game-engine actually uses the null as a key-word to responds to the players actions correctly. A potential solution to this issue, would be to create a string keyword and use that instead of the reserved null keyword.

---

* 3
[Errorprone-report] 

With over 100 instances, the 
>“Found non-transient, non-static member. Please mark as transient or provide accessors.” 

is about 


>“Member variables need to be marked as transient, static, or have accessor methods in the class.”

A lot of the variables that are initialized int he beginning of the code, does not have the correct accessors, nor are they set as static, transient or serializable. It’s important to note though, that about 90% of the instances of the problem is due to the initializing of each individual room and only a few other variables, such as “highScore”, “item”, “player” etc.  The problem could easily be avoided by (as mentioned earlier) creating get/set-methods for all the variables and access the variable and objects through those, instead of accessing them directly.

---

* 4
[Errorprone-report] 

Duplicate literals occurs about 20 times, with the message 

>“The String literal “[String]” appears X times in this file; the first occurrence is on line XX”.

Essentially, the problem is simple warning against objects that contains duplicate strings, which in this situation is due to rooms some time containing the same description text in a string, such as “Corridor”, which occurs 40 times. Without knowing which room# this “corridor” have been assigned to, it could easily become very hard and difficult to navigate the code and assign/connect the rooms correctly (but even this was also originally done in conjunction with a map of the dungeons layout that I had drawn).
PMD recommends that:

> Code containing duplicate String literals can usually be improved by declaring the String >as a constant field.

In this case, that would have to be done inside the “room”-object itself, in order to fix the “problem”, but it doesn’t seem like a critical error.

---

* 5
[Errorprone-report] 

In 2 instances, the report also states similar to issue nr. 1, that  
>“DU - Anomaly: A recently defined variable is undefined. These anomalies may appear in normal source text.”

PMD is specifically stating that the splitString[] that we are using in conjunction with reading the users input, is “a recently defined variable, that is now undefined.”

---

* 6
[Errorprone-report] 

In 4 instances, PMD is warning
> “Avoid using Literals  in Conditional Statements”
This is due to us using literal variables, change/sets its content and performs different actions depending on the content of the string or int, or comparing to a literal or int variable.

An example would be when the program check an else if statement 

> else if (endGamecode == 2)

According to PMD, we should not be checking against the 2, but a method or state instead. This could be avoided by using a boolean or enum for larger and more complex conditions.

---

* 7
[Codestyle-report] 

In 3 instances, the report for codestyle warns about 
>“To avoid mistakes add a comment at the beginning of the room1 field if you want a default access modifier”

This issue has some similarities to the ones found in issue 3, which was presented in the errorprone-report.

PMD defines the issue as:

>To avoid mistakes if we want that a Method, Constructor, Field or Nested class have a default access modifier we must add a comment at the beginning of it’s declaration.

While the issues is mostly focused on writing comments for all variables (even those singles ones declared in the code), the issue also has similarities to the issue, that a few variables don’t use a methods for accessing the properties, such as get/set-methods, but we are instead directly manipulating and changing the values in the variables. This is highly regarded as unsafe and it should be avoided by using accessors, to also make the code easier to read.

So not only is this type of issue “errorprone”, but also a “codestyle”-issue! 

---

* 8
[CodeStyle-report] 

In 2 instances, the reports is warning about
> “Avoid if (x != y) ..; else ..;”

According to PMD, this should avoided by:

>Avoid negation within an “if” expression with an “else” clause. For example, rephrase:
if (x != y) diff(); else same(); as: if (x == y) same(); else diff();.
Most “if (x != y)” cases without an “else” are often return cases, so consistent use of this >rule makes the code easier to read. Also, this resolves trivial ordering problems, such as >“does the error case go first?” or “does the common case go first?”.

The 2 issues identified by the “Codestyle”-report, are both “if”-statements that are nested inside a “else if”-statement. Both cases also don’t end with a direct “return”-statement, but neither does A LOT of the other “if”-statements.

The issue is also raising the warning that the code shouldn’t check for the situation in which the case is not equal to the desired result, but should instead check if the result matches the expected result. So instead of 

> if(x!=y)

it should be more like 

>if(x==y)

This is also done to make the code more readable, as the if-else structure in the (x!=y) first has to handle the case in which the statement is true and then in the “else”-part where the (x!=y) is not true. Basically, the code is currently handling the “error”/“failure”-situation first, rather than the “succesfull”-situation.

---

* 9
[Practices-report] 

In 27 instances, the PMD report for “Best Practices” warned about:

>Position literals first in String comparisons for EqualsIgnoreCase 

Because the program is a text-based dungeon adventure game, it is not only important, but essential for the game to accurately read the user text input, analyze it and perform the correct action, since this is the only way of interacting with the game.

As an example of how we handle equalIgnoreCase can be found on line 1189:

>input.equalsIgnoreCase("Help")

However, the “correct way” according to PMD would be to: >Position literals first in comparisons, if the second argument is null then >NullPointerExceptions can be avoided, they will just return false.

Meaning our little example should be refactored into:

>“Help”.equalIgnoreCase(input)
 
Is it easier to read? I think it’s very hard to decide and comes down to personal taste. Reading the statement the “correct”-way feels a bit off, and I’m not sure that I’m going to write code that follows the “correct way“ because it seems a bit off.

---

* 10
[Practices-report] 

While “System.out.println is used” in only 1 instance on line 1371, it’s an instance that is constantly reused over and over again, in order to communicate to the player what is going through text. 

According to PMD:
> References to System.(out|err).print are usually intended for debugging purposes and can remain in the codebase even in production code. By using a logger one can enable/disable this behaviour at will (and by priority) and avoid clogging the Standard out log.

The project is not interactive through any GUI, and thus the player has to read the output from the console, meaning the project needs to use the System.out.println()

So this is an issue that can’t be fixed, because the project and functionality of the project actually depends on it. 

---

Other minor issues worth mentioning:
* [CodeStyle-report] Avoid excessively long variable names like percentageOfAttack
* [CodeStyle-report] Useless parentheses 
* [CodeStyle-report] Parameter ‘X’ is not assigned and could be declared final.
* [CodeStyle-report] Local variable ‘X’ could be declared final.

---

### Why did I chose the 10 above issues?
Looking at the results, especially from the errorprone-report covered in issues 1-6, a lot of potential issues that occurred multiple times (even over 80, 100 and 150 in some instances!) was exposed and that could lead to potential issues, bugs or misunderstandings in the future. I believed it was therefore important to go a bit deeper to understand why those errors occurred and how to best avoid them in the future. This is why I pretty much covered all the issues found in errorprone-report, because the volume and amount of the same kind of issue was so huge and the most commen, that I had to address it.

A thing that surprised me, was that the same kind of issues could show up in multiple reports, such as issue 3 and 7, which deals with the topic of “methods, variables and accessors”, which was alerted to me in the “errorprone”- and the “codestyle”-report.

I also wanted to give a broader view of the project, by running, studying and presenting different different PMD analysis (such at errorProne, Practices, CodeStyle etc.).

Given that this PMD was run on a +2 year old project, my code writing ability and style has changed and (hopefully) improved quite a bit.

---
### Exercise 2
Tried to solve the Exercise using the graphql-jpa-example https://github.com/jcrygier/graphql-jpa

After having spent a good hour or so trying to setup the project (a lot of googling, installing gradle netbeans plugin, installing gradle locally using homebrew) and reading a lot of errors messages regarding “deprecated 2.6 versions” (even though I got version 4.10.2 installed) when trying to build and clean the project, I think I succeeded in getting the test to run and see the results (found in the build -> reports -> tests -> test -> index.html).

This is the result table for the StarWarsQueryExecutorTest, which is where the mentioned “find droid by name” test is located. The “executor.execute(query).data” is also run 16 times in the test script, though 17 test are completed as seen in the picture

￼![Image 1](https://github.com/radeonxray/Ufo-Assignment2/blob/master/graphqlimg/pic1.png)

According to the table, the slowest task is the “Gets just the names of all droids” by 0.106s,
while the fastest task is “pagination without content” by 0.010s.

Upon further experimentation with the project in Netbeans, I also got the project to run the the same test inside Netbeans with the following results:
￼
![Image 2](https://github.com/radeonxray/Ufo-Assignment2/blob/master/graphqlimg/pic2.png)

The results are pretty much the same, as if the test had run outside of Netbeans and through gradle itself.

Getting to view the project with the profiler in Netbeans however, has not yielded any results.

While I’ve successfully installed the gradle plugin, the profiler tool in netbeans is greyed out and I have not been able to successfully “attach to an external project”. I have been able to connect to some kind if instance of the project, but unable to determine where in the process the project is atm., or to restart or close the “currently running projects”
￼
![Image 3](https://github.com/radeonxray/Ufo-Assignment2/blob/master/graphqlimg/pic3.png)

Though I could get a lot of data displayed when running the profiler, none of the options seemed to have the information I was looking for:

￼![Image 4](https://github.com/radeonxray/Ufo-Assignment2/blob/master/graphqlimg/pic4.png)

Not even the “main” seemed to yield any results:

![Image 5](https://github.com/radeonxray/Ufo-Assignment2/blob/master/graphqlimg/pic5.png)
￼

Going back to the gradle version 2.3 issue mentioned earlier, I was able to locate where the issue originated: From the gradle-wrapper.properties, which is set to the 2.3 version of Gradle, which gives the “deprecated“-warnings.  However, changing this to the newest version (4.10.2), kept crashing the project when trying to build it.

Upon further reading, I learned how to create a new wrapper from scratch, rather than trying to try an edit an existing one.

Ran the following command:  gradle wrapper --gradle-version 4.10.2 --distribution-type all
https://docs.gradle.org/current/userguide/gradle_wrapper.html 
Which replaced the existing gradle folder in the project and the the wrapper.jar and wrapper.properties file

The Netbeans now successfully build the project, using gradle 4.10.2!

However, this did not solve my issue with using the Profiler to inspect the gradle project.

After having spent a couple of more hours on getting the gradle project to work with the profilling tools to no success, I decided to call it quit for the time being. I know I didn't get the desired results that I was expected to find, but I did manage to get some successful findings, such as getting gradle up and running in NetBeans, updating the gradle-wrapper version, and getting the test results both inside and outside of NetBeans.

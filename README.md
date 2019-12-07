# OnlineGameForYou
A rule-based system about online games written as a task for AI course at Poznan Univeristy of Technology.
The project was tested using Java 11.

##Requirements
<li>Maven</li>

##Building
Execute `mvn package` to create a jar, with the dependencies included.

Execute `mvn jar:jar` to create a jar, without including the dependecies.

 The .jar will be in `target` subdirectory
##Dependencies
<li>Drools</li>


##Possible problems
A problem I have occured on ubuntu system was an issue cased by atk-wrapper.
To overcome it I had to comment out 
```
assistive_technologies=org.GNOME.Accessibility.AtkWrapper
```
at the /etc/{your_java_8}/accessibilty.properties.
## Rule tree
Below is the rule tree the system is based on.
![Rule Tree](RuleTree.jpg?raw=true "Tree")
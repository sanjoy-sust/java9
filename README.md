# java9
java 9 module practice
To run this project follow the below process 👍 

1. Clone or download this project
2. Go to folder java9
3. Open bash or command prompt
4. Create directory mods by run command `mkdir ./mods`
5. Run following command to compile java files to class files 
   `javac --module-source-path ./src -d ./mods $(find src -name '*.java')`
6. Now class files created inside mods folder. so we need to create mlib folder for jar files. Run following command
   `mkdir mlib`
7. Run following command to create jar file
   `jar --main-class=com.flop.client.WelcomeClient --create --file=mlib/com.flop.client@1.0.jar --module-version=1.1 -C mods/com.flop.coder . -C mods/com.flop.client .`
8. So jar file will be created at mlib folder
9. Run jar file using following command 
   `java -jar mlib/com.flop.client@1.0.jar`

That's All. Thank You.

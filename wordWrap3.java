/* 
   Modify the preceding wordWrap method into a new wordWrap3 method that wraps only whole words, 
   never chopping a word in half. Assume that a word is any whitespace-separated token 
   and that all words are under 60 characters in length.Make sure that each time you wrap a line, 
   the subsequent wrapped line(s) each begin with a word and not with any leading whitespace.
   Accept only a single parameter for the input Scanner, and send your method's output to the
   console, as in the original wordWrap problem; do not use an output file as was done in wordWrap2.
*/
   

public void wordWrap3(Scanner input){
    while(input.hasNextLine()){ // Checks if input has a new line
        String line = input.nextLine(); // Stores the line
        String[] words = line.split(" "); // Splits the line into seperate words
        String newLine = "";
        for(int i = 0; i < words.length; i++){
            if(newLine.length() + words[i].length() <= 60){ // Checks if there is space for the next word
                newLine += words[i] + " ";
            } else{ // If there isn't space for another word, print the current line and start a new one
                System.out.println(newLine);
                newLine = words[i] + " ";
            }
        }
        System.out.println(newLine); // Prints the line at the end
    }
}
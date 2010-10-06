package com.pillar.bowlinggame.view.cli;

import java.io.BufferedReader;
import java.io.Reader;

public class ConsoleGui {
  private BufferedReader reader;

  public void setReader(Reader reader) {
    this.reader = new BufferedReader(reader);
  }

  public int readNextRoll() throws Exception {
    return Integer.parseInt(reader.readLine());
  }
  
  
  

}

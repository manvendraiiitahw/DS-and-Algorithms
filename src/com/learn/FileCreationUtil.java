package com.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCreationUtil {

  public static final String directory_name = "/Users/m0k00hw/Documents/PR1/test_suite_case/rx-testsuite-collections/connexus-nextgen/1.0/src/test/resources/e2e-testsuites";
  public static final String VERSION = "_V1_V3.";
  public static final String EXISTING = "_V1_V2";

  public static void main(String args[]) throws Exception {
    File file = new File(FileCreationUtil.class.getClassLoader().getResource(directory_name).getFile());
    if (file.isDirectory()) {
      handleDirectory(file, directory_name);
    }
  }

  private static void handleDirectory(File file, String parentFilePath) throws Exception {
    File[] files = file.listFiles();
    File outputDiredtory = new File(parentFilePath);
    if (outputDiredtory.exists()) {
      outputDiredtory.delete();
    }
    outputDiredtory.mkdir();
    for (int i = 0; i < files.length; i++) {
      if (files[i].isDirectory()) {
        handleDirectory(files[i], parentFilePath + "/" + files[i].getName());
      } else {
        if (files[i].getName().contains(EXISTING)) {
          String fileName = files[i].getName().replaceAll(EXISTING, "");
          handleFile(files[i], parentFilePath + "/" + fileName.split("\\.")[0]
              + VERSION + fileName.split("\\.")[1]);
        }
      }
    }
  }

  private static void handleFile(File file, String parentFilePath) throws Exception {
    File file1 = new File(parentFilePath);
    FileWriter fileWriter = new FileWriter(file1);
    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    String str = null;
    while ((str = bufferedReader.readLine()) != null) {
      if (file.getName().contains("feature")) {
        str = str.replaceAll(EXISTING, "");
        str = str.replaceAll(".json", VERSION.split("\\.")[0] + ".json");
        str = str.replaceAll("Dictionary", VERSION.split("\\.")[0] + "Dictionary");
      }
      fileWriter.write(str + "\n");
      fileWriter.flush();
    }
    fileWriter.close();
    bufferedReader.close();
  }
}


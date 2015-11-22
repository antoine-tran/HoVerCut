/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;

/**
 *
 * @author Hooman
 */
public class PartitionerSettings {

  public String file;
  public String delimiter;
  public int window;
  public int frequency;
  public String method;
  public double lambda;
  public double epsilon;
  public short k;
  public int tasks;
  public String storage;
  public String dbUrl;
  public String user;
  public String pass;
  public boolean reset;
  public String output;
  public boolean append;
  public List<Integer> delay;
  public int restream;

  /**
   * @return the file
   */
  public String getFile() {
    return file;
  }

  /**
   * @param file the file to set
   * @return
   */
  public PartitionerSettings setFile(String file) {
    this.file = file;
    return this;
  }

  /**
   * @return the window
   */
  public int getWindow() {
    return window;
  }

  /**
   * @param window the window to set
   * @return
   */
  public PartitionerSettings setWindow(int window) {
    this.window = window;
    return this;
  }

  /**
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * @param method the method to set
   * @return
   */
  public PartitionerSettings setMethod(String method) {
    this.method = method;
    return this;
  }

  /**
   * @return the lambda
   */
  public double getLambda() {
    return lambda;
  }

  /**
   * @param lambda the lambda to set
   * @return
   */
  public PartitionerSettings setLambda(double lambda) {
    this.lambda = lambda;
    return this;
  }

  /**
   * @return the epsilon
   */
  public double getEpsilon() {
    return epsilon;
  }

  /**
   * @param epsilon the epsilon to set
   * @return
   */
  public PartitionerSettings setEpsilon(double epsilon) {
    this.epsilon = epsilon;
    return this;
  }

  /**
   * @return the k
   */
  public int getK() {
    return k;
  }

  /**
   * @param k the k to set
   * @return
   */
  public PartitionerSettings setK(short k) {
    this.k = k;
    return this;
  }

  /**
   * @return the tasks
   */
  public int getTasks() {
    return tasks;
  }

  /**
   * @param tasks the tasks to set
   * @return
   */
  public PartitionerSettings setTasks(int tasks) {
    this.tasks = tasks;
    return this;
  }

  /**
   * @return the storage
   */
  public String getStorage() {
    return storage;
  }

  /**
   * @param storage the storage to set
   * @return
   */
  public PartitionerSettings setStorage(String storage) {
    this.storage = storage;
    return this;
  }

  /**
   * @return the dbUrl
   */
  public String getDbUrl() {
    return dbUrl;
  }

  /**
   * @param dbUrl the dbUrl to set
   * @return
   */
  public PartitionerSettings setDbUrl(String dbUrl) {
    this.dbUrl = dbUrl;
    return this;
  }

  /**
   * @return the user
   */
  public String getUser() {
    return user;
  }

  /**
   * @param user the user to set
   * @return
   */
  public PartitionerSettings setUser(String user) {
    this.user = user;
    return this;
  }

  /**
   * @return the pass
   */
  public String getPass() {
    return pass;
  }

  /**
   * @param pass the pass to set
   * @return
   */
  public PartitionerSettings setPass(String pass) {
    this.pass = pass;
    return this;
  }

  /**
   * @return the reset
   */
  public boolean isReset() {
    return reset;
  }

  /**
   * @param reset the reset to set
   * @return
   */
  public PartitionerSettings setReset(boolean reset) {
    this.reset = reset;
    return this;
  }

  /**
   * @return the output
   */
  public String getOutput() {
    return output;
  }

  /**
   * @param output the output to set
   * @return
   */
  public PartitionerSettings setOutput(String output) {
    this.output = output;
    return this;
  }

  /**
   * @return the append
   */
  public boolean isAppend() {
    return append;
  }

  /**
   * @param append the append to set
   * @return
   */
  public PartitionerSettings setAppend(boolean append) {
    this.append = append;
    return this;
  }

  /**
   * @return the delay
   */
  public List<Integer> getDelay() {
    return delay;
  }

  /**
   * @param delay the delay to set
   * @return
   */
  public PartitionerSettings setDelay(List<Integer> delay) {
    this.delay = delay;
    return this;
  }

  /**
   * @return the delimiter
   */
  public String getDelimiter() {
    return delimiter;
  }

  /**
   * @param delimiter the delimiter to set
   */
  public void setDelimiter(String delimiter) {
    this.delimiter = delimiter;
  }

}

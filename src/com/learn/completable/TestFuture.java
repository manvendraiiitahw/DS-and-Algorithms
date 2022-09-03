package com.learn.completable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class TestFuture {
  public static void main(String[] args){

    List<CompletableFuture> completableFutures=new ArrayList<>();
    List<CompletableFuture> completableFutures1=new ArrayList<>();

    CompletableFuture<List> rxFillCompletableFuture=CompletableFuture.supplyAsync(
        () -> {
          for (int i=0;i<10;i++){
            System.out.println("i:"+ i);
          }
          throw new CompletionException(new Exception());
//          return null;
        }
    );
    completableFutures.add(rxFillCompletableFuture);

    CompletableFuture<List> rxFillCompletableFuture1=CompletableFuture.supplyAsync(
        () -> {
          for (int j=0;j<10;j++){
            System.out.println("j:"+ j);
          }
          return null;
        }
    );
  completableFutures1.add(rxFillCompletableFuture1);
    List<CompletableFuture> futures = new ArrayList<>();
    Collections.addAll(futures, completableFutures.toArray(new CompletableFuture[0]));
    Collections.addAll(futures, completableFutures1.toArray(new CompletableFuture[0]));
    CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
        .exceptionally(
            ex -> {
              System.out.println("Failed to execute CompletableFuture Async call:" + ex);
              throw new CompletionException(ex);
//              return null;
            })
        .join();

    Iterator iterator=completableFutures.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }

}

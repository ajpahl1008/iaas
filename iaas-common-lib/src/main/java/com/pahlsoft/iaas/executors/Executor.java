package com.pahlsoft.iaas.executors;

public interface Executor<T> {
      void sendMessage(T message);
}

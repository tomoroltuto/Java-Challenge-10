package com.example.javafinalchallenge.application.controller.exception;


public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException(String message) {
    super(message);
  }
}

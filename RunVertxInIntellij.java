class RunVertxInIntellij extends TestVerticle{

  @Override
  void start() {
    System.setProperty("vertx.test.timeout", "-1");
    initialize();
    container.deployModule("com.yourcompany~your-module-name~version");
  }

  @Test
  public void runVertxInIntellij() {}

  // A basic handler just in case you want to see the stack trace if the deploy failed. But typically won't be needed
  private static class SomeHandler implements Handler<AsyncResult<String>> {
    @Override
    public void handle(AsyncResult<String> deployed) {
      if (deployed.failed()) {
        deployed.cause().printStackTrace();
        VertxAssert.testComplete();
      }
    }
  }
}

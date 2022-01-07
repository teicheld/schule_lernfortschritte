I was struggeling to do some basic imports despite I read all that stuff.
This was sadly a very timeconsuming research for me, but I am proud to announce the rule i discoverd.

As you call the binary '.class'-files with the java tool, you have to:

either be in the project root directory
or use the '-classpath'-argument to point to it.

If you are somewhere else than your root-directory, java will give you back an error:
	Error: Could not find or load main class app
	Caused by: java.lang.NoClassDefFoundError: some/app (wrong name: app)

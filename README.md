## reproduce build issue

1. install flutter (optional?)
2. flutter build appbundle --release
3. get the output
4. fix by upgrading gradle to 4.1.0

```
[matej@matej-workstation stripe_terminal]$ flutter build appbundle --release

Building without sound null safety
For more information see https://dart.dev/null-safety/unsound-null-safety

                                                                        
FAILURE: Build failed with an exception.                                
                                                                        
* What went wrong:                                                      
Execution failed for task ':app:transformClassesAndResourcesWithR8ForRelease'.
> com.android.tools.r8.errors.Unreachable: Expected to find a possibly throwing instruction
                                                                        
* Try:                                                                  
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.
                                                                        
* Get more help at https://help.gradle.org                              
                                                                        
BUILD FAILED in 4s                                                      
Running Gradle task 'bundleRelease'...                                  
Running Gradle task 'bundleRelease'... Done                         5.0s
[!] The shrinker may have failed to optimize the Java bytecode.
    To disable the shrinker, pass the `--no-shrink` flag to this command.
    To learn more, see: https://developer.android.com/studio/build/shrink-code
Gradle task bundleRelease failed with exit code 1

```

# stripe_terminal

A new Flutter application.

## Getting Started

This project is a starting point for a Flutter application.

A few resources to get you started if this is your first Flutter project:

- [Lab: Write your first Flutter app](https://flutter.dev/docs/get-started/codelab)
- [Cookbook: Useful Flutter samples](https://flutter.dev/docs/cookbook)

For help getting started with Flutter, view our
[online documentation](https://flutter.dev/docs), which offers tutorials,
samples, guidance on mobile development, and a full API reference.

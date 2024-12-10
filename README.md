# Groovy sum() Method Issue

This repository demonstrates a subtle issue in Groovy related to the `sum()` method and how it behaves with lists passed as arguments to methods.  The problem arises from Groovy's type inference mechanism not correctly identifying the list type within the method's scope.

## Bug Description

The `sum()` method works correctly when called directly on a list. However, when the same list is passed as an argument to a method and `sum()` is called within that method, a `MissingMethodException` is thrown.  This is unexpected behavior for many Groovy developers.

## Solution

The solution involves explicitly casting the list argument to a type that Groovy's `sum()` method can recognize (such as `java.util.List`). This forces the correct type inference and resolves the issue.  See the `bugSolution.groovy` file for the fix.
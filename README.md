# findFile to find a specific file

## Business objective

Being able to retrieve the absolute path of file within a file hierarchy whose root is a given folder path.

For example, I want to find a file named result.json with /tmp/lost root folder.

For your information, 

### Use cases
* The folder doesn't exist, return an error to the user.
* The file doesn't exist under the given root folder, return an error to the user.
* The file exists under the given root, return the absolute path, file included, ie /tmp/lost/really/really/lost/result.json
* If many files exists under the given root folder, return a list of files order by path shortness, the shortest path must be the first in the list. 

## Technical requirements

You have to expose an API with Spring boot.

The file system is not necessarily a FS on the computer but could be an AWS S3.

Security can be added in a next step so not every users would be able to access to this API.

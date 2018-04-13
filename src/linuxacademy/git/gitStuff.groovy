package linuxacademy.git

def gitCommit(gitPath) {
  return "/usr/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text  
}

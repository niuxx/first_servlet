1、create a new repository on the command line
echo "# first_servlet" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/niuxx/first_servlet.git
git push -u origin main
2、push an existing repository from the command line
git remote add origin https://github.com/niuxx/first_servlet.git
git branch -M main
git push -u origin main
3、 import code from another repository
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.
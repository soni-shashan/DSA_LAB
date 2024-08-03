#include<stdio.h>
#include<stdlib.h>

typedef struct node node;
struct node
{
    int data;
    node* link;
};
int print_count(node* head){
    int count=0;
    node* temp;
    temp=head;
    while (temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->link;
        count++;
    }
    return count;
}
int main(){
    node *head,*ptr,*ptr1;
    head=(node*)malloc(sizeof(node));
    head->data=10;
    head->link=NULL;
    ptr=(node*)malloc(sizeof(node));
    ptr->data=15;
    ptr->link=NULL;
    head->link=ptr;
    ptr1=(node*)malloc(sizeof(node));
    ptr1->data=20;
    ptr1->link=NULL;
    ptr->link=ptr1;
    printf("\n%d",print_count(head));
    return 0;
}
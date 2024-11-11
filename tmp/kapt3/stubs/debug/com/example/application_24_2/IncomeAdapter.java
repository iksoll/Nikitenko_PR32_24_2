package com.example.application_24_2;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/application_24_2/IncomeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/application_24_2/IncomeAdapter$IncomeViewHolder;", "incomeList", "", "Lcom/example/application_24_2/Income;", "onIncomeRemoved", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "selectedItems", "getItemCount", "", "getSelectedItems", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeIncome", "income", "IncomeViewHolder", "app_debug"})
public final class IncomeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.application_24_2.IncomeAdapter.IncomeViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.application_24_2.Income> incomeList;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.application_24_2.Income, kotlin.Unit> onIncomeRemoved = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.application_24_2.Income> selectedItems;
    
    public IncomeAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.application_24_2.Income> incomeList, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.application_24_2.Income, kotlin.Unit> onIncomeRemoved) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.application_24_2.IncomeAdapter.IncomeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.application_24_2.IncomeAdapter.IncomeViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.application_24_2.Income> getSelectedItems() {
        return null;
    }
    
    public final void removeIncome(@org.jetbrains.annotations.NotNull
    com.example.application_24_2.Income income) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/application_24_2/IncomeAdapter$IncomeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "amountTextView", "Landroid/widget/TextView;", "getAmountTextView", "()Landroid/widget/TextView;", "dateTextView", "getDateTextView", "descriptionTextView", "getDescriptionTextView", "app_debug"})
    public static final class IncomeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView dateTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView descriptionTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView amountTextView = null;
        
        public IncomeViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDateTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDescriptionTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getAmountTextView() {
            return null;
        }
    }
}
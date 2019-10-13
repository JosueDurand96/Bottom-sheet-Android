package com.example.bottomsheetandroidjava;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDialog extends BottomSheetDialogFragment {
    @SuppressLint("RestrictedApi")
    @Override
    public void setupDialog(Dialog dialog,int style){
        super.setupDialog(dialog,style);

        View contentView = View.inflate(getContext(),R.layout.bottom_sheet,null);
        dialog.setContentView(contentView);
    }
}

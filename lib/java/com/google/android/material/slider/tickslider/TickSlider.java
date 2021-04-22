package com.google.android.material.slider.tickslider;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;

import java.util.List;

public class TickSlider extends BaseTikcSlider<TickSlider, TickSlider.OnChangeListener, TickSlider.OnSliderTouchListener> {

  public interface OnChangeListener extends BaseOnChangeListener<TickSlider> {}
  public interface OnSliderTouchListener extends BaseOnSliderTouchListener<TickSlider> {}

  public TickSlider(@NonNull Context context) {
    this(context, null);
  }

  public TickSlider(@NonNull Context context, @Nullable AttributeSet attrs) {
    this(context, attrs, R.attr.sliderStyle);
  }

  public TickSlider(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    TypedArray a = context.obtainStyledAttributes(attrs, new int[] {android.R.attr.value});
    if (a.hasValue(0)) {
      setValue(a.getFloat(0, 0f));
    }
    a.recycle();
  }

  public void setSnapValues(List<Float> values) {
    setPossibleValues(values);
  }

  public List<Float> getSnapValues() {
    return getPossibleValues();
  }

  public float getValue() {
    return getValues().get(0);
  }
  public void setValue(float value) {
    setValues(value);
  }

  protected boolean pickActiveThumb() {
    if (getActiveThumbIndex() != -1) {
      return true;
    }
    // Only one thumb to focus
    setActiveThumbIndex(0);
    return true;
  }

}

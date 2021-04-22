/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.material.catalog.slider;

import io.material.catalog.R;

import android.os.Bundle;

import androidx.appcompat.widget.SwitchCompat;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;

import com.google.android.material.slider.BasicLabelFormatter;
import com.google.android.material.slider.LabelFormatter;
import com.google.android.material.slider.Slider;
import com.google.android.material.slider.tickslider.TickSlider;

import java.util.ArrayList;
import java.util.List;

import io.material.catalog.feature.DemoFragment;

/**
 * Fragment to display a few basic uses of the {@link Slider} widget in discrete mode for the
 * Catalog app.
 */
public class SliderDiscreteDemoFragment extends DemoFragment {

  @Nullable
  @Override
  public View onCreateDemoView(
      LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    View view =
        inflater.inflate(R.layout.cat_slider_demo_discrete, viewGroup, false /* attachToRoot */);

    setUpSlider(view, R.id.switch_button_1, R.id.slider_1, null);
    setUpSlider(view, R.id.switch_button_2, R.id.slider_2, null);
    setUpSlider(view, R.id.switch_button_3, R.id.slider_3, null);
    setUpSlider(view, R.id.switch_button_4, R.id.slider_4, new BasicLabelFormatter());
    setUpSlider(view, R.id.switch_button_5, R.id.slider_5, null);
    setUpSlider2(view, R.id.switch_button_6, R.id.slider_6, null);

    return view;
  }

  private void setUpSlider(
      View view, @IdRes int switchId, @IdRes int sliderId, LabelFormatter labelFormatter) {
    final Slider slider = view.findViewById(sliderId);
    slider.setLabelFormatter(labelFormatter);
    SwitchCompat switchButton = view.findViewById(switchId);
    switchButton.setOnCheckedChangeListener(
        (buttonView, isChecked) -> slider.setEnabled(isChecked));
    switchButton.setChecked(true);
  }

  private void setUpSlider2(
      View view, @IdRes int switchId, @IdRes int sliderId, LabelFormatter labelFormatter) {
    final TickSlider slider = view.findViewById(sliderId);
    slider.setValueFrom(2000f);
    slider.setValueTo(80000f);

    List<Float> possibleValues = new ArrayList<Float>();
    possibleValues.add(2000f);
    possibleValues.add(3000f);
    possibleValues.add(4000f);
    possibleValues.add(5000f);
    possibleValues.add(6000f);
    possibleValues.add(7000f);
    possibleValues.add(8000f);
    possibleValues.add(10000f);
    possibleValues.add(11000f);
    possibleValues.add(12000f);
    possibleValues.add(13000f);
    possibleValues.add(14000f);
    possibleValues.add(15000f);

    possibleValues.add(18000f);
    possibleValues.add(19500f);
    possibleValues.add(21000f);
    possibleValues.add(22500f);
    possibleValues.add(24000f);
    possibleValues.add(25500f);
    possibleValues.add(27000f);
    possibleValues.add(28500f);
    possibleValues.add(30000f);
    possibleValues.add(31500f);
    possibleValues.add(33000f);
    possibleValues.add(35500f);
    possibleValues.add(37000f);
    possibleValues.add(39500f);
    possibleValues.add(41000f);
    possibleValues.add(42500f);
    possibleValues.add(45000f);
    possibleValues.add(46000f);
    possibleValues.add(47000f);
    possibleValues.add(48000f);
    possibleValues.add(49000f);
    possibleValues.add(50000f);
    possibleValues.add(51000f);
    possibleValues.add(52000f);
    possibleValues.add(53000f);
    possibleValues.add(54000f);
    possibleValues.add(55000f);
    possibleValues.add(56000f);
    possibleValues.add(57000f);
    possibleValues.add(58000f);
    possibleValues.add(59000f);
    possibleValues.add(60000f);
    possibleValues.add(62000f);
    possibleValues.add(63000f);
    possibleValues.add(64000f);
    possibleValues.add(65000f);
    possibleValues.add(66000f);
    possibleValues.add(67000f);
    possibleValues.add(68000f);
    possibleValues.add(69000f);
    possibleValues.add(70000f);
    possibleValues.add(72000f);
    possibleValues.add(73000f);
    possibleValues.add(74000f);
    possibleValues.add(75000f);
    possibleValues.add(76000f);
    possibleValues.add(77000f);
    possibleValues.add(78000f);
    possibleValues.add(79000f);
    possibleValues.add(80000f);
    possibleValues.add(82000f);
    possibleValues.add(83000f);
    possibleValues.add(84000f);
    possibleValues.add(85000f);
    possibleValues.add(86000f);
    possibleValues.add(87000f);
    possibleValues.add(88000f);
    possibleValues.add(89000f);
    possibleValues.add(90000f);
    possibleValues.add(92000f);
    possibleValues.add(93000f);
    possibleValues.add(94000f);
    possibleValues.add(95000f);
    possibleValues.add(96000f);
    possibleValues.add(97000f);
    possibleValues.add(98000f);
    possibleValues.add(99000f);

    slider.setPossibleValues(possibleValues);

    Log.d("TEST64", "possible values " + slider.getPossibleValues());

    slider.setLabelFormatter(labelFormatter);
    SwitchCompat switchButton = view.findViewById(switchId);
    switchButton.setOnCheckedChangeListener(
        (buttonView, isChecked) -> slider.setEnabled(isChecked));
    switchButton.setChecked(true);
  }


  private void setUpSlider3(
      View view, @IdRes int switchId, @IdRes int sliderId, LabelFormatter labelFormatter) {
    final Slider slider = view.findViewById(sliderId);
    slider.setValueFrom(2000f);
    slider.setValueTo(80000f);

    slider.setLabelFormatter(labelFormatter);
    SwitchCompat switchButton = view.findViewById(switchId);
    switchButton.setOnCheckedChangeListener(
        (buttonView, isChecked) -> slider.setEnabled(isChecked));
    switchButton.setChecked(true);
  }
}

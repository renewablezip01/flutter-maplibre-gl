// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

import 'package:flutter/material.dart';

abstract class ExamplePage extends StatelessWidget {
  const ExamplePage(this.leading, this.title, {super.key});

  final Widget leading;
  final String title;
}
